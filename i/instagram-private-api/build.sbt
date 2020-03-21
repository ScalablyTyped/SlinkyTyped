organization := "org.scalablytyped.slinky"
name := "instagram-private-api"
version := "1.39.0-17d2f5"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.4",
  "org.scalablytyped.slinky" %%% "bluebird" % "3.5-dt-20200302Z-a7b277",
  "org.scalablytyped.slinky" %%% "caseless" % "0.12-dt-20190311Z-27614c",
  "org.scalablytyped.slinky" %%% "chance" % "1.0-dt-20200226Z-19b606",
  "org.scalablytyped.slinky" %%% "form-data" % "2.5.1-c3cd72",
  "org.scalablytyped.slinky" %%% "lifeomic__attempt" % "3.0.0-3b672e",
  "org.scalablytyped.slinky" %%% "luxon" % "1.21-dt-20191115Z-8d72f6",
  "org.scalablytyped.slinky" %%% "node" % "13.7-dt-20200228Z-eb4e34",
  "org.scalablytyped.slinky" %%% "request" % "2.48-dt-20191217Z-0a9bec",
  "org.scalablytyped.slinky" %%% "rxjs" % "6.5.4-f2cfe3",
  "org.scalablytyped.slinky" %%% "rxjs-compat" % "6.5.4-518e60",
  "org.scalablytyped.slinky" %%% "std" % "3.8-16327f",
  "org.scalablytyped.slinky" %%% "tough-cookie" % "2.3-dt-20191206Z-cf20a2",
  "org.scalablytyped.slinky" %%% "ts-custom-error" % "2.2.2-2c384e",
  "org.scalablytyped.slinky" %%% "ts-xor" % "1.0.8-3059c7")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
