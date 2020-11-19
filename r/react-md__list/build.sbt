organization := "org.scalablytyped.slinky"
name := "react-md__list"
version := "2.1.2-8cbbc7"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "csstype" % "3.0.2-fce754",
  "org.scalablytyped.slinky" %%% "prop-types" % "15.7-dt-20200515Z-ce652f",
  "org.scalablytyped.slinky" %%% "react" % "16.9-dt-20200711Z-6a9854",
  "org.scalablytyped.slinky" %%% "react-md__portal" % "2.0.2-32b7af",
  "org.scalablytyped.slinky" %%% "react-md__states" % "2.1.2-171a9a",
  "org.scalablytyped.slinky" %%% "react-md__transition" % "2.1.2-30f207",
  "org.scalablytyped.slinky" %%% "react-md__utils" % "2.1.0-a8afb8",
  "org.scalablytyped.slinky" %%% "react-transition-group" % "4.4-dt-20200521Z-775259",
  "org.scalablytyped.slinky" %%% "std" % "3.9-38a9bf")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
