organization := "org.scalablytyped.slinky"
name := "instagram-private-api"
version := "1.37.1-8dddaf"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.2",
  "org.scalablytyped.slinky" %%% "bluebird" % "3.5-dt-20191111Z-91d0a2",
  "org.scalablytyped.slinky" %%% "caseless" % "0.12-dt-20190311Z-2af0b5",
  "org.scalablytyped.slinky" %%% "chance" % "1.0-dt-20191223Z-4f14f0",
  "org.scalablytyped.slinky" %%% "form-data" % "2.5.1-2fe4b7",
  "org.scalablytyped.slinky" %%% "lifeomic__attempt" % "3.0.0-a4016b",
  "org.scalablytyped.slinky" %%% "node" % "13.1-dt-20200103Z-c18ea7",
  "org.scalablytyped.slinky" %%% "request" % "2.48-dt-20191217Z-b57e10",
  "org.scalablytyped.slinky" %%% "rxjs" % "6.5.4-efacc9",
  "org.scalablytyped.slinky" %%% "rxjs-compat" % "6.5.4-b42d8f",
  "org.scalablytyped.slinky" %%% "std" % "3.7-9f4f43",
  "org.scalablytyped.slinky" %%% "tough-cookie" % "2.3-dt-20191206Z-dcfafa",
  "org.scalablytyped.slinky" %%% "ts-custom-error" % "2.2.2-ff42eb",
  "org.scalablytyped.slinky" %%% "ts-xor" % "1.0.8-a2f35a")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
        