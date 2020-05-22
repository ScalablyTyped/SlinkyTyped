organization := "org.scalablytyped.slinky"
name := "protractor-browser-logs"
version := "1.0-dt-20200226Z-25510a"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "blocking-proxy" % "1.0.1-e4b043",
  "org.scalablytyped.slinky" %%% "node" % "14.0-dt-20200519Z-fa178d",
  "org.scalablytyped.slinky" %%% "protractor" % "5.4.4-f3d7a7",
  "org.scalablytyped.slinky" %%% "q" % "1.5-dt-20200515Z-d29ee5",
  "org.scalablytyped.slinky" %%% "selenium-webdriver" % "4.0-dt-20200515Z-a2c2aa",
  "org.scalablytyped.slinky" %%% "std" % "3.9-c21af0",
  "org.scalablytyped.slinky" %%% "webdriver-js-extender" % "2.1.0-70ddf2")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
