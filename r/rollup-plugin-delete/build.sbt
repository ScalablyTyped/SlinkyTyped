organization := "org.scalablytyped.slinky"
name := "rollup-plugin-delete"
version := "1.1.0-1c6c95"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.2",
  "org.scalablytyped.slinky" %%% "del" % "5.1.0-e22ab9",
  "org.scalablytyped.slinky" %%% "estree" % "0.0-unknown-dt-20191223Z-3dd043",
  "org.scalablytyped.slinky" %%% "fast-glob" % "3.0.4-f70f61",
  "org.scalablytyped.slinky" %%% "glob" % "7.1-dt-20180920Z-11ad5d",
  "org.scalablytyped.slinky" %%% "globby" % "10.0.1-6b14e9",
  "org.scalablytyped.slinky" %%% "minimatch" % "3.0-dt-20180214Z-4df7c9",
  "org.scalablytyped.slinky" %%% "node" % "13.1-dt-20200103Z-c18ea7",
  "org.scalablytyped.slinky" %%% "nodelib__fs_dot_scandir" % "2.1.2-aed689",
  "org.scalablytyped.slinky" %%% "nodelib__fs_dot_stat" % "2.0.2-2d877e",
  "org.scalablytyped.slinky" %%% "nodelib__fs_dot_walk" % "1.2.3-85eee4",
  "org.scalablytyped.slinky" %%% "rollup" % "1.27.14-9701af",
  "org.scalablytyped.slinky" %%% "std" % "3.7-9f4f43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
        