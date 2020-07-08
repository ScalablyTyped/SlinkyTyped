organization := "org.scalablytyped.slinky"
name := "material-ui__icons"
version := "4.9.1-1f2ee8"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "cheerio" % "v0.22.0-dt-20200515Z-40ab85",
  "org.scalablytyped.slinky" %%% "csstype" % "2.6.6-2278c5",
  "org.scalablytyped.slinky" %%% "enzyme" % "3.10-dt-20200515Z-7b35d0",
  "org.scalablytyped.slinky" %%% "jss" % "10.3.0-3d133d",
  "org.scalablytyped.slinky" %%% "material-ui__core" % "3.9.3-723864",
  "org.scalablytyped.slinky" %%% "node" % "14.0-dt-20200609Z-6ee82c",
  "org.scalablytyped.slinky" %%% "popper_dot_js" % "1.16.1-37704e",
  "org.scalablytyped.slinky" %%% "prop-types" % "15.7-dt-20200515Z-360342",
  "org.scalablytyped.slinky" %%% "react" % "16.9-dt-20200617Z-036789",
  "org.scalablytyped.slinky" %%% "std" % "3.9-dec240")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
