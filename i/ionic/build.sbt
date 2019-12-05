organization := "org.scalablytyped.slinky"
name := "ionic"
version := "5.4.9-ea55a8"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.2",
  "org.scalablytyped.slinky" %%% "cookiejar" % "2.1-dt-20190116Z-51c048",
  "org.scalablytyped.slinky" %%% "debug" % "4.1-dt-20190808Z-4bebb2",
  "org.scalablytyped.slinky" %%% "elementtree" % "0.1-dt-20180830Z-99a2ee",
  "org.scalablytyped.slinky" %%% "inquirer" % "6.5-dt-20190731Z-5c7cdf",
  "org.scalablytyped.slinky" %%% "ionic__cli-framework" % "3.0.3-f53240",
  "org.scalablytyped.slinky" %%% "ionic__cli-framework-prompts" % "1.0.2-963883",
  "org.scalablytyped.slinky" %%% "ionic__discover" % "2.0.6-d64980",
  "org.scalablytyped.slinky" %%% "ionic__utils-network" % "1.0.5-87d1a7",
  "org.scalablytyped.slinky" %%% "ionic__utils-object" % "1.0.5-2827d2",
  "org.scalablytyped.slinky" %%% "ionic__utils-subprocess" % "1.0.10-36482a",
  "org.scalablytyped.slinky" %%% "log-update" % "3.3.0-6c5acd",
  "org.scalablytyped.slinky" %%% "minimist" % "1.2.0-dt-20190322Z-322150",
  "org.scalablytyped.slinky" %%% "minipass" % "2.2-dt-20180214Z-7aa340",
  "org.scalablytyped.slinky" %%% "node" % "12.12-dt-20191126Z-6a8cbf",
  "org.scalablytyped.slinky" %%% "rxjs" % "6.5.3-54aa37",
  "org.scalablytyped.slinky" %%% "rxjs-compat" % "6.5.3-14d83f",
  "org.scalablytyped.slinky" %%% "std" % "3.7-cc3821",
  "org.scalablytyped.slinky" %%% "string-width" % "4.2.0-1c762e",
  "org.scalablytyped.slinky" %%% "superagent" % "4.1-dt-20191028Z-edeb3e",
  "org.scalablytyped.slinky" %%% "tar" % "4.0-dt-20190710Z-d0075f",
  "org.scalablytyped.slinky" %%% "through" % "0.0-unknown-dt-20190322Z-2708b6",
  "org.scalablytyped.slinky" %%% "ws" % "6.0-dt-20191125Z-5dacb9")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
        