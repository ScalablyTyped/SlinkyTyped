organization := "org.scalablytyped.slinky"
name := "ionic"
version := "5.4.16-bf3943"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "cookiejar" % "2.1-dt-20201014Z-7e9ed2",
  "org.scalablytyped.slinky" %%% "debug" % "4.1-dt-20200226Z-1fc0b4",
  "org.scalablytyped.slinky" %%% "elementtree" % "0.1-dt-20180830Z-bb747c",
  "org.scalablytyped.slinky" %%% "inquirer" % "7.3-dt-20200820Z-bf84f7",
  "org.scalablytyped.slinky" %%% "ionic__cli-framework" % "3.0.6-f52742",
  "org.scalablytyped.slinky" %%% "ionic__cli-framework-prompts" % "1.0.4-4878b3",
  "org.scalablytyped.slinky" %%% "ionic__discover" % "2.0.8-dc7671",
  "org.scalablytyped.slinky" %%% "ionic__utils-network" % "1.0.6-33548b",
  "org.scalablytyped.slinky" %%% "ionic__utils-object" % "1.0.6-e60d95",
  "org.scalablytyped.slinky" %%% "ionic__utils-subprocess" % "1.0.13-d94341",
  "org.scalablytyped.slinky" %%% "log-update" % "4.0.0-be7807",
  "org.scalablytyped.slinky" %%% "minimist" % "1.2-dt-20201106Z-16747d",
  "org.scalablytyped.slinky" %%% "minipass" % "2.2-dt-20200713Z-03f355",
  "org.scalablytyped.slinky" %%% "node" % "14.14-dt-20201119Z-f152d9",
  "org.scalablytyped.slinky" %%% "rxjs" % "6.6.3-2c76fd",
  "org.scalablytyped.slinky" %%% "rxjs-compat" % "6.6.3-7ba562",
  "org.scalablytyped.slinky" %%% "std" % "4.1-233b27",
  "org.scalablytyped.slinky" %%% "string-width" % "4.2.0-146f16",
  "org.scalablytyped.slinky" %%% "superagent" % "4.1-dt-20200825Z-87087f",
  "org.scalablytyped.slinky" %%% "tar" % "4.0-dt-20201117Z-84140a",
  "org.scalablytyped.slinky" %%% "through" % "0.0-unknown-dt-20201002Z-62ab37",
  "org.scalablytyped.slinky" %%% "ws" % "7.4-dt-20201109Z-9c5f70")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
