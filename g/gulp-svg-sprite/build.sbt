organization := "org.scalablytyped.slinky"
name := "gulp-svg-sprite"
version := "1.2.9-dt-20200225Z-f64155"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "logform" % "2.1.2-4ef492",
  "org.scalablytyped.slinky" %%% "node" % "13.13-dt-20200426Z-9e8213",
  "org.scalablytyped.slinky" %%% "std" % "3.8-c726bb",
  "org.scalablytyped.slinky" %%% "svg-sprite" % "0.0-unknown-dt-20200225Z-afdcaa",
  "org.scalablytyped.slinky" %%% "vinyl" % "2.0-dt-20200225Z-ee4bf0",
  "org.scalablytyped.slinky" %%% "winston" % "3.2.1-e69936",
  "org.scalablytyped.slinky" %%% "winston-transport" % "4.3.0-f0b653")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
