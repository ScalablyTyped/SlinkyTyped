organization := "org.scalablytyped.slinky"
name := "ng-cordova"
version := "0.0-unknown-dt-20201002Z-3d610f"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "angular" % "1.8-dt-20201104Z-980418",
  "org.scalablytyped.slinky" %%% "cordova-plugin-camera" % "5.0.1-6a7005",
  "org.scalablytyped.slinky" %%% "cordova-plugin-file" % "6.0.2-0c369e",
  "org.scalablytyped.slinky" %%% "cordova-plugin-file-transfer" % "1.7.1-c85f5b",
  "org.scalablytyped.slinky" %%% "std" % "4.1-233b27")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
