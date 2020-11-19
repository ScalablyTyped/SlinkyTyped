organization := "org.scalablytyped.slinky"
name := "protractor-browser-logs"
version := "1.0-dt-20200226Z-4d121e"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "blocking-proxy" % "1.0.1-7d5bee",
  "org.scalablytyped.slinky" %%% "node" % "14.0-dt-20200724Z-8c2fed",
  "org.scalablytyped.slinky" %%% "protractor" % "7.0.0-a3bc31",
  "org.scalablytyped.slinky" %%% "q" % "1.5-dt-20200515Z-fdd177",
  "org.scalablytyped.slinky" %%% "selenium-webdriver" % "4.0-dt-20200515Z-a2e122",
  "org.scalablytyped.slinky" %%% "std" % "3.9-38a9bf",
  "org.scalablytyped.slinky" %%% "webdriver-js-extender" % "2.1.0-0d1c69")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
