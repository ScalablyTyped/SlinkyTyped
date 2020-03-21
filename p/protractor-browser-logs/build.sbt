organization := "org.scalablytyped.slinky"
name := "protractor-browser-logs"
version := "1.0-dt-20200226Z-b247d4"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.4",
  "org.scalablytyped.slinky" %%% "blocking-proxy" % "1.0.1-76e133",
  "org.scalablytyped.slinky" %%% "node" % "13.7-dt-20200228Z-eb4e34",
  "org.scalablytyped.slinky" %%% "protractor" % "5.4.3-3343b0",
  "org.scalablytyped.slinky" %%% "q" % "1.5-dt-20200225Z-40cb07",
  "org.scalablytyped.slinky" %%% "selenium-webdriver" % "4.0-dt-20200302Z-8ad895",
  "org.scalablytyped.slinky" %%% "std" % "3.8-16327f",
  "org.scalablytyped.slinky" %%% "webdriver-js-extender" % "2.1.0-046559")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
