organization := "org.scalablytyped.slinky"
name := "baseui"
version := "9.105.0-cd0c1e"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "card-validator" % "8.1.0-3c4448",
  "org.scalablytyped.slinky" %%% "credit-card-type" % "9.1.0-77a6cf",
  "org.scalablytyped.slinky" %%% "csstype" % "2.6.14-23cf0c",
  "org.scalablytyped.slinky" %%% "date-fns" % "2.16.1-3278a8",
  "org.scalablytyped.slinky" %%% "prop-types" % "15.7-dt-20200515Z-ed7fbd",
  "org.scalablytyped.slinky" %%% "react" % "17.0-dt-20201121Z-8f0b52",
  "org.scalablytyped.slinky" %%% "std" % "4.1-e01533",
  "org.scalablytyped.slinky" %%% "styletron-react" % "5.0-dt-20190925Z-5c142f",
  "org.scalablytyped.slinky" %%% "styletron-standard" % "2.0-dt-20200731Z-20e431")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
