organization := "org.scalablytyped.slinky"
name := "react-md__app-bar"
version := "2.1.2-00d92e"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "csstype" % "3.0.2-c880b4",
  "org.scalablytyped.slinky" %%% "prop-types" % "15.7-dt-20200515Z-9fd6d8",
  "org.scalablytyped.slinky" %%% "react" % "16.9-dt-20200711Z-c528cd",
  "org.scalablytyped.slinky" %%% "react-md__button" % "2.1.2-6fd34f",
  "org.scalablytyped.slinky" %%% "react-md__portal" % "2.0.2-7457d7",
  "org.scalablytyped.slinky" %%% "react-md__states" % "2.1.2-90607e",
  "org.scalablytyped.slinky" %%% "react-md__transition" % "2.1.2-9c4f8e",
  "org.scalablytyped.slinky" %%% "react-md__utils" % "2.1.0-4648c6",
  "org.scalablytyped.slinky" %%% "react-transition-group" % "4.4-dt-20200521Z-ae6f66",
  "org.scalablytyped.slinky" %%% "std" % "3.9-88d6d8")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
