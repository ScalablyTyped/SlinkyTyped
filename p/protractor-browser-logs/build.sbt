organization := "org.scalablytyped.slinky"
name := "protractor-browser-logs"
version := "1.0-dt-20200226Z-54da95"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "blocking-proxy" % "1.0.1-9e1e3a",
  "org.scalablytyped.slinky" %%% "node" % "13.13-dt-20200426Z-6c3110",
  "org.scalablytyped.slinky" %%% "protractor" % "5.4.3-01ac35",
  "org.scalablytyped.slinky" %%% "q" % "1.5-dt-20200225Z-ecad40",
  "org.scalablytyped.slinky" %%% "selenium-webdriver" % "4.0-dt-20200302Z-6bfa89",
  "org.scalablytyped.slinky" %%% "std" % "3.8-8ac92e",
  "org.scalablytyped.slinky" %%% "webdriver-js-extender" % "2.1.0-8e7ad0")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
