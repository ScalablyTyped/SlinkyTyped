organization := "org.scalablytyped.slinky"
name := "ng-cordova"
version := "0.0-unknown-dt-20201002Z-8cf2c3"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "angular" % "1.8-dt-20201104Z-98f8f5",
  "org.scalablytyped.slinky" %%% "cordova-plugin-camera" % "5.0.1-87f137",
  "org.scalablytyped.slinky" %%% "cordova-plugin-file" % "6.0.2-16846c",
  "org.scalablytyped.slinky" %%% "cordova-plugin-file-transfer" % "1.7.1-6cb919",
  "org.scalablytyped.slinky" %%% "std" % "4.1-e01533")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
