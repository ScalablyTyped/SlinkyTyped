organization := "org.scalablytyped.slinky"
name := "ionic"
version := "5.4.16-3ac489"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.4",
  "org.scalablytyped.slinky" %%% "cookiejar" % "2.1-dt-20190116Z-472c0e",
  "org.scalablytyped.slinky" %%% "debug" % "4.1-dt-20200226Z-963250",
  "org.scalablytyped.slinky" %%% "elementtree" % "0.1-dt-20180830Z-843ab5",
  "org.scalablytyped.slinky" %%% "inquirer" % "6.5-dt-20200226Z-e2bc21",
  "org.scalablytyped.slinky" %%% "ionic__cli-framework" % "3.0.6-cc65de",
  "org.scalablytyped.slinky" %%% "ionic__cli-framework-prompts" % "1.0.4-8f0230",
  "org.scalablytyped.slinky" %%% "ionic__discover" % "2.0.8-15314b",
  "org.scalablytyped.slinky" %%% "ionic__utils-network" % "1.0.6-d3bce5",
  "org.scalablytyped.slinky" %%% "ionic__utils-object" % "1.0.6-75f849",
  "org.scalablytyped.slinky" %%% "ionic__utils-subprocess" % "1.0.13-951ea7",
  "org.scalablytyped.slinky" %%% "log-update" % "3.4.0-588b9e",
  "org.scalablytyped.slinky" %%% "minimist" % "1.2.0-dt-20200225Z-1245f0",
  "org.scalablytyped.slinky" %%% "minipass" % "2.2-dt-20180214Z-00a9eb",
  "org.scalablytyped.slinky" %%% "node" % "13.7-dt-20200228Z-eb4e34",
  "org.scalablytyped.slinky" %%% "rxjs" % "6.5.4-f2cfe3",
  "org.scalablytyped.slinky" %%% "rxjs-compat" % "6.5.4-518e60",
  "org.scalablytyped.slinky" %%% "std" % "3.8-16327f",
  "org.scalablytyped.slinky" %%% "string-width" % "4.2.0-263fbe",
  "org.scalablytyped.slinky" %%% "superagent" % "4.1-dt-20200214Z-77ba73",
  "org.scalablytyped.slinky" %%% "tar" % "4.0-dt-20200227Z-0ca810",
  "org.scalablytyped.slinky" %%% "through" % "0.0-unknown-dt-20200225Z-41b466",
  "org.scalablytyped.slinky" %%% "ws" % "7.2-dt-20200227Z-1a4b01")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
