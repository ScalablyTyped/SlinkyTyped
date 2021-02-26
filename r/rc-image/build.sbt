organization := "org.scalablytyped.slinky"
name := "rc-image"
version := "4.0.1-c69ad7"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "csstype" % "2.6.14-58bcb0",
  "org.scalablytyped.slinky" %%% "prop-types" % "15.7-dt-20200515Z-931d77",
  "org.scalablytyped.slinky" %%% "rc-dialog" % "8.4.3-9ed61c",
  "org.scalablytyped.slinky" %%% "rc-util" % "5.5.0-63a1aa",
  "org.scalablytyped.slinky" %%% "react" % "17.0-dt-20201121Z-9cde70",
  "org.scalablytyped.slinky" %%% "std" % "4.1-233b27")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
