organization := "org.scalablytyped.slinky"
name := "browserfs"
version := "1.4.3-38964f"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.2",
  "org.scalablytyped.slinky" %%% "dropboxjs" % "0.0-unknown-dt-20190322Z-2765c9",
  "org.scalablytyped.slinky" %%% "filesystem" % "0.0-unknown-dt-20190322Z-21cc2a",
  "org.scalablytyped.slinky" %%% "filewriter" % "0.0-unknown-dt-20190322Z-45e29e",
  "org.scalablytyped.slinky" %%% "node" % "13.1-dt-20200103Z-c18ea7",
  "org.scalablytyped.slinky" %%% "std" % "3.7-9f4f43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
        