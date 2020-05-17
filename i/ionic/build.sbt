organization := "org.scalablytyped.slinky"
name := "ionic"
version := "5.4.16-b7f443"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "cookiejar" % "2.1-dt-20190116Z-231916",
  "org.scalablytyped.slinky" %%% "debug" % "4.1-dt-20200226Z-c08a13",
  "org.scalablytyped.slinky" %%% "elementtree" % "0.1-dt-20180830Z-3d8cd8",
  "org.scalablytyped.slinky" %%% "inquirer" % "6.5-dt-20200226Z-0a5fbb",
  "org.scalablytyped.slinky" %%% "ionic__cli-framework" % "3.0.6-c417d7",
  "org.scalablytyped.slinky" %%% "ionic__cli-framework-prompts" % "1.0.4-7b0785",
  "org.scalablytyped.slinky" %%% "ionic__discover" % "2.0.8-69639c",
  "org.scalablytyped.slinky" %%% "ionic__utils-network" % "1.0.6-0b8a04",
  "org.scalablytyped.slinky" %%% "ionic__utils-object" % "1.0.6-080c27",
  "org.scalablytyped.slinky" %%% "ionic__utils-subprocess" % "1.0.13-0b349f",
  "org.scalablytyped.slinky" %%% "log-update" % "3.4.0-00ea64",
  "org.scalablytyped.slinky" %%% "minimist" % "1.2.0-dt-20200225Z-e0ee53",
  "org.scalablytyped.slinky" %%% "minipass" % "2.2-dt-20180214Z-0ece74",
  "org.scalablytyped.slinky" %%% "node" % "13.13-dt-20200426Z-9e8213",
  "org.scalablytyped.slinky" %%% "rxjs" % "6.5.4-e2a094",
  "org.scalablytyped.slinky" %%% "rxjs-compat" % "6.5.4-86bf9e",
  "org.scalablytyped.slinky" %%% "std" % "3.8-c726bb",
  "org.scalablytyped.slinky" %%% "string-width" % "4.2.0-0e87eb",
  "org.scalablytyped.slinky" %%% "superagent" % "4.1-dt-20200214Z-1bade5",
  "org.scalablytyped.slinky" %%% "tar" % "4.0-dt-20200227Z-9d01ea",
  "org.scalablytyped.slinky" %%% "through" % "0.0-unknown-dt-20200225Z-7a8959",
  "org.scalablytyped.slinky" %%% "ws" % "7.2-dt-20200413Z-ae451a")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
