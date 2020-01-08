organization := "org.scalablytyped.slinky"
name := "rx-jquery"
version := "0.0-unknown-dt-20190322Z-bf5fa9"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.2",
  "org.scalablytyped.slinky" %%% "jquery" % "3.3-dt-20191126Z-c6d356",
  "org.scalablytyped.slinky" %%% "rx-core" % "4.0-dt-20190322Z-c54414",
  "org.scalablytyped.slinky" %%% "rx-core-binding" % "4.0-dt-20190322Z-8bbd5f",
  "org.scalablytyped.slinky" %%% "rx-lite" % "4.0-dt-20190322Z-99bc0e",
  "org.scalablytyped.slinky" %%% "rx-lite-aggregates" % "4.0-dt-20190322Z-9f4edf",
  "org.scalablytyped.slinky" %%% "rx-lite-async" % "4.0-dt-20181116Z-b310a3",
  "org.scalablytyped.slinky" %%% "rx-lite-backpressure" % "4.0-dt-20180214Z-99c126",
  "org.scalablytyped.slinky" %%% "rx-lite-coincidence" % "4.0-dt-20190322Z-9e8b5d",
  "org.scalablytyped.slinky" %%% "rx-lite-experimental" % "4.0-dt-20180214Z-f963c9",
  "org.scalablytyped.slinky" %%% "rx-lite-joinpatterns" % "4.0-dt-20180214Z-bfd887",
  "org.scalablytyped.slinky" %%% "rx-lite-testing" % "4.0-dt-20180214Z-eae9a1",
  "org.scalablytyped.slinky" %%% "rx-lite-time" % "4.0-dt-20190322Z-183755",
  "org.scalablytyped.slinky" %%% "rx-lite-virtualtime" % "4.0-dt-20190322Z-fa603a",
  "org.scalablytyped.slinky" %%% "sizzle" % "2.3-dt-20181006Z-dd2029",
  "org.scalablytyped.slinky" %%% "std" % "3.7-9f4f43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
        