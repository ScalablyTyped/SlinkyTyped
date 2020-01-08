organization := "org.scalablytyped.slinky"
name := "ionic"
version := "5.4.13-fb4c7e"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.2",
  "org.scalablytyped.slinky" %%% "cookiejar" % "2.1-dt-20190116Z-d5830f",
  "org.scalablytyped.slinky" %%% "debug" % "4.1-dt-20190808Z-59e5de",
  "org.scalablytyped.slinky" %%% "elementtree" % "0.1-dt-20180830Z-462832",
  "org.scalablytyped.slinky" %%% "inquirer" % "6.5-dt-20190731Z-f30c20",
  "org.scalablytyped.slinky" %%% "ionic__cli-framework" % "3.0.5-b98a3a",
  "org.scalablytyped.slinky" %%% "ionic__cli-framework-prompts" % "1.0.4-f6bb44",
  "org.scalablytyped.slinky" %%% "ionic__discover" % "2.0.7-123802",
  "org.scalablytyped.slinky" %%% "ionic__utils-network" % "1.0.6-b2f7dd",
  "org.scalablytyped.slinky" %%% "ionic__utils-object" % "1.0.6-0383e4",
  "org.scalablytyped.slinky" %%% "ionic__utils-subprocess" % "1.0.12-d5ed8e",
  "org.scalablytyped.slinky" %%% "log-update" % "3.3.0-f577c4",
  "org.scalablytyped.slinky" %%% "minimist" % "1.2.0-dt-20190322Z-83bee2",
  "org.scalablytyped.slinky" %%% "minipass" % "2.2-dt-20180214Z-dcdfe1",
  "org.scalablytyped.slinky" %%% "node" % "13.1-dt-20200103Z-c18ea7",
  "org.scalablytyped.slinky" %%% "rxjs" % "6.5.4-efacc9",
  "org.scalablytyped.slinky" %%% "rxjs-compat" % "6.5.4-b42d8f",
  "org.scalablytyped.slinky" %%% "std" % "3.7-9f4f43",
  "org.scalablytyped.slinky" %%% "string-width" % "4.2.0-1c762e",
  "org.scalablytyped.slinky" %%% "superagent" % "4.1-dt-20191028Z-f41470",
  "org.scalablytyped.slinky" %%% "tar" % "4.0-dt-20190710Z-22795e",
  "org.scalablytyped.slinky" %%% "through" % "0.0-unknown-dt-20190322Z-aff20c",
  "org.scalablytyped.slinky" %%% "ws" % "6.0-dt-20191125Z-3ee039")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
        