organization := "org.scalablytyped.slinky"
name := "ionic"
version := "5.4.16-b3b949"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "cookiejar" % "2.1-dt-20201014Z-25de9c",
  "org.scalablytyped.slinky" %%% "debug" % "4.1-dt-20200226Z-794065",
  "org.scalablytyped.slinky" %%% "elementtree" % "0.1-dt-20180830Z-7e8964",
  "org.scalablytyped.slinky" %%% "inquirer" % "7.3-dt-20200820Z-dd25f1",
  "org.scalablytyped.slinky" %%% "ionic__cli-framework" % "3.0.6-455f2d",
  "org.scalablytyped.slinky" %%% "ionic__cli-framework-prompts" % "1.0.4-88e553",
  "org.scalablytyped.slinky" %%% "ionic__discover" % "2.0.8-4c57c9",
  "org.scalablytyped.slinky" %%% "ionic__utils-network" % "1.0.6-611dc7",
  "org.scalablytyped.slinky" %%% "ionic__utils-object" % "1.0.6-4f1f97",
  "org.scalablytyped.slinky" %%% "ionic__utils-subprocess" % "1.0.13-99c3e3",
  "org.scalablytyped.slinky" %%% "log-update" % "4.0.0-2e7f99",
  "org.scalablytyped.slinky" %%% "minimist" % "1.2-dt-20201106Z-d4fdd7",
  "org.scalablytyped.slinky" %%% "minipass" % "2.2-dt-20200713Z-2caaf0",
  "org.scalablytyped.slinky" %%% "node" % "14.14-dt-20201119Z-b1b1c0",
  "org.scalablytyped.slinky" %%% "rxjs" % "6.6.3-d2f269",
  "org.scalablytyped.slinky" %%% "rxjs-compat" % "6.6.3-6703be",
  "org.scalablytyped.slinky" %%% "std" % "4.1-e01533",
  "org.scalablytyped.slinky" %%% "string-width" % "4.2.0-042d84",
  "org.scalablytyped.slinky" %%% "superagent" % "4.1-dt-20200825Z-7fb83c",
  "org.scalablytyped.slinky" %%% "tar" % "4.0-dt-20201117Z-fc81c9",
  "org.scalablytyped.slinky" %%% "through" % "0.0-unknown-dt-20201002Z-ca33b3",
  "org.scalablytyped.slinky" %%% "ws" % "7.4-dt-20201109Z-eeb31e")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
