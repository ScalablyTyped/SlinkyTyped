organization := "org.scalablytyped.slinky"
name := "electron-publish"
version := "21.2.0-f8b5e9"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.2",
  "org.scalablytyped.slinky" %%% "builder-util" % "21.2.0-316035",
  "org.scalablytyped.slinky" %%% "builder-util-runtime" % "8.3.0-373b95",
  "org.scalablytyped.slinky" %%% "debug" % "4.1-dt-20190808Z-59e5de",
  "org.scalablytyped.slinky" %%% "fs-extra" % "8.0-dt-20191016Z-19215d",
  "org.scalablytyped.slinky" %%% "lazy-val" % "1.0.4-c6298d",
  "org.scalablytyped.slinky" %%% "node" % "13.1-dt-20200103Z-c18ea7",
  "org.scalablytyped.slinky" %%% "std" % "3.7-9f4f43",
  "org.scalablytyped.slinky" %%% "temp-file" % "3.3.4-e1580a")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
        