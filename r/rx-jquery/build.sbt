organization := "org.scalablytyped.slinky"
name := "rx-jquery"
version := "0.0-unknown-dt-20190322Z-8332ec"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.2",
  "org.scalablytyped.slinky" %%% "jquery" % "3.3-dt-20191126Z-ae0751",
  "org.scalablytyped.slinky" %%% "rx-core" % "4.0-dt-20190322Z-d1e9a9",
  "org.scalablytyped.slinky" %%% "rx-core-binding" % "4.0-dt-20190322Z-d9e42e",
  "org.scalablytyped.slinky" %%% "rx-lite" % "4.0-dt-20190322Z-9f7953",
  "org.scalablytyped.slinky" %%% "rx-lite-aggregates" % "4.0-dt-20190322Z-caa49f",
  "org.scalablytyped.slinky" %%% "rx-lite-async" % "4.0-dt-20181116Z-704b3b",
  "org.scalablytyped.slinky" %%% "rx-lite-backpressure" % "4.0-dt-20180214Z-e03a05",
  "org.scalablytyped.slinky" %%% "rx-lite-coincidence" % "4.0-dt-20190322Z-3b1cc3",
  "org.scalablytyped.slinky" %%% "rx-lite-experimental" % "4.0-dt-20180214Z-c638d6",
  "org.scalablytyped.slinky" %%% "rx-lite-joinpatterns" % "4.0-dt-20180214Z-bfd887",
  "org.scalablytyped.slinky" %%% "rx-lite-testing" % "4.0-dt-20180214Z-27d24d",
  "org.scalablytyped.slinky" %%% "rx-lite-time" % "4.0-dt-20190322Z-ba48b6",
  "org.scalablytyped.slinky" %%% "rx-lite-virtualtime" % "4.0-dt-20190322Z-b4563e",
  "org.scalablytyped.slinky" %%% "sizzle" % "2.3-dt-20181006Z-c4cdb0",
  "org.scalablytyped.slinky" %%% "std" % "3.7-cc3821")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
        