organization := "org.scalablytyped.slinky"
name := "material-ui__core"
version := "3.9.3-dd7c4d"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "cheerio" % "v0.22.0-dt-20200515Z-4eeb41",
  "org.scalablytyped.slinky" %%% "csstype" % "2.6.6-57a4b7",
  "org.scalablytyped.slinky" %%% "enzyme" % "3.10-dt-20200515Z-e55b02",
  "org.scalablytyped.slinky" %%% "jss" % "10.3.0-bd8faa",
  "org.scalablytyped.slinky" %%% "node" % "14.0-dt-20200609Z-5ab0d9",
  "org.scalablytyped.slinky" %%% "popper_dot_js" % "1.16.1-88e681",
  "org.scalablytyped.slinky" %%% "prop-types" % "15.7-dt-20200515Z-151476",
  "org.scalablytyped.slinky" %%% "react" % "16.9-dt-20200617Z-5b2e1b",
  "org.scalablytyped.slinky" %%% "std" % "3.9-18eec6")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
