organization := "org.scalablytyped.slinky"
name := "react-dom"
version := "16.9-dt-20200519Z-f4b022"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "csstype" % "2.6.6-046861",
  "org.scalablytyped.slinky" %%% "prop-types" % "15.7-dt-20200515Z-75109a",
  "org.scalablytyped.slinky" %%% "react" % "16.9-dt-20200617Z-c51c3f",
  "org.scalablytyped.slinky" %%% "std" % "3.9-a77a62")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
