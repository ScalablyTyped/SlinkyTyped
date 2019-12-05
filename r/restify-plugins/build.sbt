organization := "org.scalablytyped.slinky"
name := "restify-plugins"
version := "1.5-dt-20181015Z-966004"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.2",
  "org.scalablytyped.slinky" %%% "bunyan" % "1.8-dt-20190311Z-16188b",
  "org.scalablytyped.slinky" %%% "formidable" % "1.0.16-dt-20190322Z-adf2a7",
  "org.scalablytyped.slinky" %%% "node" % "12.12-dt-20191126Z-6a8cbf",
  "org.scalablytyped.slinky" %%% "restify" % "8.4-dt-20191119Z-f7e9b1",
  "org.scalablytyped.slinky" %%% "spdy" % "3.4-dt-20181121Z-dc4477",
  "org.scalablytyped.slinky" %%% "std" % "3.7-cc3821")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
        