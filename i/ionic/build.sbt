organization := "org.scalablytyped.slinky"
name := "ionic"
version := "5.4.16-cec84c"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "cookiejar" % "2.1-dt-20190116Z-538fab",
  "org.scalablytyped.slinky" %%% "debug" % "4.1-dt-20200226Z-dacba6",
  "org.scalablytyped.slinky" %%% "elementtree" % "0.1-dt-20180830Z-79b8af",
  "org.scalablytyped.slinky" %%% "inquirer" % "6.5-dt-20200226Z-3eadc9",
  "org.scalablytyped.slinky" %%% "ionic__cli-framework" % "3.0.6-764af1",
  "org.scalablytyped.slinky" %%% "ionic__cli-framework-prompts" % "1.0.4-26f0d0",
  "org.scalablytyped.slinky" %%% "ionic__discover" % "2.0.8-1f7e30",
  "org.scalablytyped.slinky" %%% "ionic__utils-network" % "1.0.6-9f073e",
  "org.scalablytyped.slinky" %%% "ionic__utils-object" % "1.0.6-126c79",
  "org.scalablytyped.slinky" %%% "ionic__utils-subprocess" % "1.0.13-bc8ba7",
  "org.scalablytyped.slinky" %%% "log-update" % "3.4.0-416afb",
  "org.scalablytyped.slinky" %%% "minimist" % "1.2.0-dt-20200515Z-5c8090",
  "org.scalablytyped.slinky" %%% "minipass" % "2.2-dt-20200515Z-9dc3f9",
  "org.scalablytyped.slinky" %%% "node" % "14.0-dt-20200519Z-fa178d",
  "org.scalablytyped.slinky" %%% "rxjs" % "6.5.5-a158f0",
  "org.scalablytyped.slinky" %%% "rxjs-compat" % "6.5.5-1d035b",
  "org.scalablytyped.slinky" %%% "std" % "3.9-c21af0",
  "org.scalablytyped.slinky" %%% "string-width" % "4.2.0-6e175f",
  "org.scalablytyped.slinky" %%% "superagent" % "4.1-dt-20200515Z-8b964c",
  "org.scalablytyped.slinky" %%% "tar" % "4.0-dt-20200227Z-31d656",
  "org.scalablytyped.slinky" %%% "through" % "0.0-unknown-dt-20200515Z-1c0109",
  "org.scalablytyped.slinky" %%% "ws" % "7.2-dt-20200413Z-4b6676")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
