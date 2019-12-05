organization := "org.scalablytyped.slinky"
name := "app-builder-lib"
version := "21.2.0-929a0a"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.2",
  "org.scalablytyped.slinky" %%% "builder-util" % "21.2.0-2066c3",
  "org.scalablytyped.slinky" %%% "builder-util-runtime" % "8.3.0-e99bfc",
  "org.scalablytyped.slinky" %%% "debug" % "4.1-dt-20190808Z-4bebb2",
  "org.scalablytyped.slinky" %%% "electron-publish" % "21.2.0-65c8f7",
  "org.scalablytyped.slinky" %%% "fs-extra" % "8.0-dt-20191016Z-a0aa63",
  "org.scalablytyped.slinky" %%% "lazy-val" % "1.0.4-a44419",
  "org.scalablytyped.slinky" %%% "node" % "12.12-dt-20191126Z-6a8cbf",
  "org.scalablytyped.slinky" %%% "std" % "3.7-cc3821",
  "org.scalablytyped.slinky" %%% "temp-file" % "3.3.4-aac117")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
        