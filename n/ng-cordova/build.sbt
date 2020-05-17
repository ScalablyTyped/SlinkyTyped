organization := "org.scalablytyped.slinky"
name := "ng-cordova"
version := "0.0-unknown-dt-20200226Z-9f56d2"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "angular" % "1.7-dt-20200331Z-257f44",
  "org.scalablytyped.slinky" %%% "cordova-plugin-camera" % "4.1.0-c3d0f4",
  "org.scalablytyped.slinky" %%% "cordova-plugin-file" % "6.0.2-f38a2f",
  "org.scalablytyped.slinky" %%% "cordova-plugin-file-transfer" % "1.7.1-afe960",
  "org.scalablytyped.slinky" %%% "std" % "3.8-c726bb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
