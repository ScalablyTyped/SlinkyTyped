organization := "org.scalablytyped.slinky"
name := "firebase__functions"
version := "0.4.38-61de63"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "firebase__app-types" % "0.6.0-1cbce9",
  "org.scalablytyped.slinky" %%% "firebase__auth-interop-types" % "0.1.4-96aa04",
  "org.scalablytyped.slinky" %%% "firebase__component" % "0.1.8-690069",
  "org.scalablytyped.slinky" %%% "firebase__functions-types" % "0.3.16-6463aa",
  "org.scalablytyped.slinky" %%% "firebase__logger" % "0.2.0-b0379d",
  "org.scalablytyped.slinky" %%% "firebase__messaging-types" % "0.4.4-e2e385",
  "org.scalablytyped.slinky" %%% "firebase__util" % "0.2.43-0a4ca2",
  "org.scalablytyped.slinky" %%% "std" % "3.8-8ac92e")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
