organization := "org.scalablytyped.slinky"
name := "ionic"
version := "5.4.16-b1779b"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "cookiejar" % "2.1-dt-20190116Z-0eca80",
  "org.scalablytyped.slinky" %%% "debug" % "4.1-dt-20200226Z-645012",
  "org.scalablytyped.slinky" %%% "elementtree" % "0.1-dt-20180830Z-58db6e",
  "org.scalablytyped.slinky" %%% "inquirer" % "6.5-dt-20200226Z-18490c",
  "org.scalablytyped.slinky" %%% "ionic__cli-framework" % "3.0.6-3c4ccc",
  "org.scalablytyped.slinky" %%% "ionic__cli-framework-prompts" % "1.0.4-9a1273",
  "org.scalablytyped.slinky" %%% "ionic__discover" % "2.0.8-318e31",
  "org.scalablytyped.slinky" %%% "ionic__utils-network" % "1.0.6-c63cb0",
  "org.scalablytyped.slinky" %%% "ionic__utils-object" % "1.0.6-b73241",
  "org.scalablytyped.slinky" %%% "ionic__utils-subprocess" % "1.0.13-c598fa",
  "org.scalablytyped.slinky" %%% "log-update" % "3.4.0-38fc9a",
  "org.scalablytyped.slinky" %%% "minimist" % "1.2.0-dt-20200225Z-349e1a",
  "org.scalablytyped.slinky" %%% "minipass" % "2.2-dt-20180214Z-a4a8c5",
  "org.scalablytyped.slinky" %%% "node" % "13.13-dt-20200426Z-6c3110",
  "org.scalablytyped.slinky" %%% "rxjs" % "6.5.4-f7a9ee",
  "org.scalablytyped.slinky" %%% "rxjs-compat" % "6.5.4-484a39",
  "org.scalablytyped.slinky" %%% "std" % "3.8-8ac92e",
  "org.scalablytyped.slinky" %%% "string-width" % "4.2.0-00fb49",
  "org.scalablytyped.slinky" %%% "superagent" % "4.1-dt-20200214Z-31d1bb",
  "org.scalablytyped.slinky" %%% "tar" % "4.0-dt-20200227Z-318a62",
  "org.scalablytyped.slinky" %%% "through" % "0.0-unknown-dt-20200225Z-2cdc6d",
  "org.scalablytyped.slinky" %%% "ws" % "7.2-dt-20200413Z-e5ad6b")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
