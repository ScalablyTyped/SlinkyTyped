organization := "org.scalablytyped.slinky"
name := "instagram-private-api"
version := "1.43.3-bd97f4"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "bluebird" % "3.5-dt-20201028Z-a72283",
  "org.scalablytyped.slinky" %%% "caseless" % "0.12-dt-20200515Z-7842cb",
  "org.scalablytyped.slinky" %%% "chance" % "1.1-dt-20200515Z-8cf578",
  "org.scalablytyped.slinky" %%% "form-data" % "3.0.0-113260",
  "org.scalablytyped.slinky" %%% "lifeomic__attempt" % "3.0.0-4e32fe",
  "org.scalablytyped.slinky" %%% "luxon" % "1.25-dt-20200918Z-d44281",
  "org.scalablytyped.slinky" %%% "node" % "14.14-dt-20201119Z-f152d9",
  "org.scalablytyped.slinky" %%% "request" % "2.48-dt-20200515Z-937f12",
  "org.scalablytyped.slinky" %%% "rxjs" % "6.6.3-2c76fd",
  "org.scalablytyped.slinky" %%% "rxjs-compat" % "6.6.3-7ba562",
  "org.scalablytyped.slinky" %%% "std" % "4.1-233b27",
  "org.scalablytyped.slinky" %%% "tough-cookie" % "4.0-dt-20201002Z-b0ea7d",
  "org.scalablytyped.slinky" %%% "ts-custom-error" % "2.2.2-d9121e",
  "org.scalablytyped.slinky" %%% "ts-xor" % "1.0.8-5f624c",
  "org.scalablytyped.slinky" %%% "utility-types" % "3.10.0-4d5e69")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
