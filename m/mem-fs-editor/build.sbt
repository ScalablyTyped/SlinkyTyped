organization := "org.scalablytyped.slinky"
name := "mem-fs-editor"
version := "5.1-dt-20190217Z-271078"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.2",
  "org.scalablytyped.slinky" %%% "ejs" % "3.0-dt-20191205Z-03d696",
  "org.scalablytyped.slinky" %%% "glob" % "7.1-dt-20180920Z-11ad5d",
  "org.scalablytyped.slinky" %%% "mem-fs" % "1.1-dt-20181203Z-03ba6d",
  "org.scalablytyped.slinky" %%% "minimatch" % "3.0-dt-20180214Z-4df7c9",
  "org.scalablytyped.slinky" %%% "node" % "13.1-dt-20200103Z-c18ea7",
  "org.scalablytyped.slinky" %%% "std" % "3.7-9f4f43",
  "org.scalablytyped.slinky" %%% "vinyl" % "2.0-dt-20191106Z-27f499")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
        