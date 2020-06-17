organization := "org.scalablytyped.slinky"
name := "material-ui__core"
version := "3.9.3-645a0c"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "cheerio" % "v0.22.0-dt-20200515Z-e7411e",
  "org.scalablytyped.slinky" %%% "csstype" % "2.6.6-046861",
  "org.scalablytyped.slinky" %%% "enzyme" % "3.10-dt-20200515Z-ae1924",
  "org.scalablytyped.slinky" %%% "jss" % "10.1.1-17e74f",
  "org.scalablytyped.slinky" %%% "node" % "14.0-dt-20200519Z-094fa5",
  "org.scalablytyped.slinky" %%% "popper_dot_js" % "1.16.1-1eaf3c",
  "org.scalablytyped.slinky" %%% "prop-types" % "15.7-dt-20200515Z-75109a",
  "org.scalablytyped.slinky" %%% "react" % "16.9-dt-20200515Z-5e5e25",
  "org.scalablytyped.slinky" %%% "std" % "3.9-a77a62")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
