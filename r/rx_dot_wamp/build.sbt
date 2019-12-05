organization := "org.scalablytyped.slinky"
name := "rx_dot_wamp"
version := "0.5.0-dt-20190322Z-a18fa8"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.2",
  "org.scalablytyped.slinky" %%% "autobahn" % "18.10-dt-20190311Z-3e717c",
  "org.scalablytyped.slinky" %%% "rx-core" % "4.0-dt-20190322Z-d1e9a9",
  "org.scalablytyped.slinky" %%% "rx-lite" % "4.0-dt-20190322Z-9f7953",
  "org.scalablytyped.slinky" %%% "rx-lite-aggregates" % "4.0-dt-20190322Z-caa49f",
  "org.scalablytyped.slinky" %%% "std" % "3.7-cc3821",
  "org.scalablytyped.slinky" %%% "when" % "2.4.0-dt-20190322Z-5efc23")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
        