organization := "org.scalablytyped.slinky"
name := "restify-cors-middleware"
version := "1.0-dt-20180214Z-8f41d5"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.2",
  "org.scalablytyped.slinky" %%% "bunyan" % "1.8-dt-20190311Z-6cf6d0",
  "org.scalablytyped.slinky" %%% "formidable" % "1.0.16-dt-20190322Z-952be7",
  "org.scalablytyped.slinky" %%% "node" % "13.1-dt-20200103Z-c18ea7",
  "org.scalablytyped.slinky" %%% "restify" % "8.4-dt-20191119Z-3183e6",
  "org.scalablytyped.slinky" %%% "spdy" % "3.4-dt-20181121Z-31efb0",
  "org.scalablytyped.slinky" %%% "std" % "3.7-9f4f43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
        