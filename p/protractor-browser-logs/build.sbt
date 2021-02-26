organization := "org.scalablytyped.slinky"
name := "protractor-browser-logs"
version := "1.0-dt-20200226Z-210d96"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "blocking-proxy" % "1.0.1-d76e6e",
  "org.scalablytyped.slinky" %%% "node" % "14.14-dt-20201119Z-f152d9",
  "org.scalablytyped.slinky" %%% "protractor" % "7.0.0-15ec69",
  "org.scalablytyped.slinky" %%% "q" % "1.5-dt-20201002Z-d020f7",
  "org.scalablytyped.slinky" %%% "selenium-webdriver" % "4.0-dt-20201028Z-8cd466",
  "org.scalablytyped.slinky" %%% "std" % "4.1-233b27",
  "org.scalablytyped.slinky" %%% "webdriver-js-extender" % "2.1.0-9233a5")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
