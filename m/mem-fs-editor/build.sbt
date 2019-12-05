organization := "org.scalablytyped.slinky"
name := "mem-fs-editor"
version := "5.1-dt-20190217Z-f291dc"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.2",
  "org.scalablytyped.slinky" %%% "ejs" % "2.7-dt-20191127Z-93e400",
  "org.scalablytyped.slinky" %%% "glob" % "7.1-dt-20180920Z-840fcb",
  "org.scalablytyped.slinky" %%% "mem-fs" % "1.1-dt-20181203Z-26f172",
  "org.scalablytyped.slinky" %%% "minimatch" % "3.0-dt-20180214Z-561ad4",
  "org.scalablytyped.slinky" %%% "node" % "12.12-dt-20191126Z-6a8cbf",
  "org.scalablytyped.slinky" %%% "std" % "3.7-cc3821",
  "org.scalablytyped.slinky" %%% "vinyl" % "2.0-dt-20191106Z-2312e6")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
        