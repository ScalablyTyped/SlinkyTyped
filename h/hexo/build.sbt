organization := "org.scalablytyped.slinky"
name := "hexo"
version := "3.8-dt-20190808Z-b2ae91"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.2",
  "org.scalablytyped.slinky" %%% "bunyan" % "1.8-dt-20190311Z-6cf6d0",
  "org.scalablytyped.slinky" %%% "connect" % "v3.4.0-dt-20191217Z-4825ba",
  "org.scalablytyped.slinky" %%% "hexo-util" % "0.6-dt-20190808Z-448bcf",
  "org.scalablytyped.slinky" %%% "minimist" % "1.2.0-dt-20190322Z-83bee2",
  "org.scalablytyped.slinky" %%% "moment" % "2.24.0-9323e2",
  "org.scalablytyped.slinky" %%% "node" % "13.1-dt-20200103Z-c18ea7",
  "org.scalablytyped.slinky" %%% "std" % "3.7-9f4f43",
  "org.scalablytyped.slinky" %%% "underscore" % "1.9-dt-20191118Z-8df05b")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
        