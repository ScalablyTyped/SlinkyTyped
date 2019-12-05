organization := "org.scalablytyped.slinky"
name := "rx-node"
version := "0.0-unknown-dt-20190322Z-37e716"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.2",
  "org.scalablytyped.slinky" %%% "node" % "12.12-dt-20191126Z-6a8cbf",
  "org.scalablytyped.slinky" %%% "rx-core" % "4.0-dt-20190322Z-d1e9a9",
  "org.scalablytyped.slinky" %%% "rx-lite" % "4.0-dt-20190322Z-9f7953",
  "org.scalablytyped.slinky" %%% "rx-lite-aggregates" % "4.0-dt-20190322Z-caa49f",
  "org.scalablytyped.slinky" %%% "std" % "3.7-cc3821")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
        