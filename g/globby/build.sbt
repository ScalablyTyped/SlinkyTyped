organization := "org.scalablytyped.slinky"
name := "globby"
version := "10.0.1-213b44"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.2",
  "org.scalablytyped.slinky" %%% "fast-glob" % "3.0.4-aa51a2",
  "org.scalablytyped.slinky" %%% "glob" % "7.1-dt-20180920Z-840fcb",
  "org.scalablytyped.slinky" %%% "minimatch" % "3.0-dt-20180214Z-561ad4",
  "org.scalablytyped.slinky" %%% "node" % "12.12-dt-20191126Z-6a8cbf",
  "org.scalablytyped.slinky" %%% "nodelib__fs_dot_scandir" % "2.1.2-1d892b",
  "org.scalablytyped.slinky" %%% "nodelib__fs_dot_stat" % "2.0.2-31b415",
  "org.scalablytyped.slinky" %%% "nodelib__fs_dot_walk" % "1.2.3-7f8d04",
  "org.scalablytyped.slinky" %%% "std" % "3.7-cc3821")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
        