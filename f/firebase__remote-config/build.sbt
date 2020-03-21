organization := "org.scalablytyped.slinky"
name := "firebase__remote-config"
version := "0.1.13-ee0a33"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.4",
  "org.scalablytyped.slinky" %%% "firebase__app-types" % "0.5.1-c1c107",
  "org.scalablytyped.slinky" %%% "firebase__installations-types" % "0.3.1-8e6091",
  "org.scalablytyped.slinky" %%% "firebase__logger" % "0.1.35-db5f88",
  "org.scalablytyped.slinky" %%% "firebase__remote-config-types" % "0.1.6-36d4b4",
  "org.scalablytyped.slinky" %%% "firebase__util" % "0.2.40-9ff338",
  "org.scalablytyped.slinky" %%% "std" % "3.8-16327f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
