organization := "org.scalablytyped.slinky"
name := "instagram-private-api"
version := "1.43.3-c09b0a"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "bluebird" % "3.5-dt-20201028Z-64939d",
  "org.scalablytyped.slinky" %%% "caseless" % "0.12-dt-20200515Z-da01e2",
  "org.scalablytyped.slinky" %%% "chance" % "1.1-dt-20200515Z-81ce7b",
  "org.scalablytyped.slinky" %%% "form-data" % "3.0.0-ee7e6b",
  "org.scalablytyped.slinky" %%% "lifeomic__attempt" % "3.0.0-aeee66",
  "org.scalablytyped.slinky" %%% "luxon" % "1.25-dt-20200918Z-4cdc8d",
  "org.scalablytyped.slinky" %%% "node" % "14.14-dt-20201119Z-b1b1c0",
  "org.scalablytyped.slinky" %%% "request" % "2.48-dt-20200515Z-8a4c09",
  "org.scalablytyped.slinky" %%% "rxjs" % "6.6.3-d2f269",
  "org.scalablytyped.slinky" %%% "rxjs-compat" % "6.6.3-6703be",
  "org.scalablytyped.slinky" %%% "std" % "4.1-e01533",
  "org.scalablytyped.slinky" %%% "tough-cookie" % "4.0-dt-20201002Z-9a7324",
  "org.scalablytyped.slinky" %%% "ts-custom-error" % "2.2.2-a411ac",
  "org.scalablytyped.slinky" %%% "ts-xor" % "1.0.8-8178cd",
  "org.scalablytyped.slinky" %%% "utility-types" % "3.10.0-0549d4")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
