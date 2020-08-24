organization := "org.scalablytyped.slinky"
name := "gulp-svg-sprite"
version := "1.2.9-dt-20200515Z-bb6f3c"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "logform" % "2.2.0-36629d",
  "org.scalablytyped.slinky" %%% "node" % "14.0-dt-20200724Z-df8c17",
  "org.scalablytyped.slinky" %%% "std" % "3.9-88d6d8",
  "org.scalablytyped.slinky" %%% "svg-sprite" % "0.0-unknown-dt-20200515Z-a15b57",
  "org.scalablytyped.slinky" %%% "vinyl" % "2.0-dt-20200515Z-68d52f",
  "org.scalablytyped.slinky" %%% "winston" % "3.3.3-24d78b",
  "org.scalablytyped.slinky" %%% "winston-transport" % "4.4.0-3d97f2")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
