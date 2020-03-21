organization := "org.scalablytyped.slinky"
name := "firebase__database"
version := "0.5.21-4af0c9"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.4",
  "org.scalablytyped.slinky" %%% "firebase__app-types" % "0.5.1-c1c107",
  "org.scalablytyped.slinky" %%% "firebase__auth-interop-types" % "0.1.2-df0644",
  "org.scalablytyped.slinky" %%% "firebase__component" % "0.1.5-591edd",
  "org.scalablytyped.slinky" %%% "firebase__database-types" % "0.4.11-40415e",
  "org.scalablytyped.slinky" %%% "firebase__util" % "0.2.40-9ff338",
  "org.scalablytyped.slinky" %%% "std" % "3.8-16327f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
