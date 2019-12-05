organization := "org.scalablytyped.slinky"
name := "ng-cordova"
version := "0.0-unknown-dt-20190322Z-70e072"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.2",
  "org.scalablytyped.slinky" %%% "angular" % "1.6-dt-20191126Z-47ff13",
  "org.scalablytyped.slinky" %%% "cordova-plugin-camera" % "4.1.0-266e2e",
  "org.scalablytyped.slinky" %%% "cordova-plugin-file" % "6.0.2-e4462c",
  "org.scalablytyped.slinky" %%% "cordova-plugin-file-transfer" % "1.7.1-ccebf2",
  "org.scalablytyped.slinky" %%% "std" % "3.7-cc3821")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
        