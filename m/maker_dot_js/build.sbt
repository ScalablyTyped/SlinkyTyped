organization := "org.scalablytyped.slinky"
name := "maker_dot_js"
version := "0.9.33-dt-20190322Z-165996"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.2",
  "org.scalablytyped.slinky" %%% "bezier-js" % "0.0-unknown-dt-20190322Z-fa8404",
  "org.scalablytyped.slinky" %%% "node" % "12.12-dt-20191126Z-6a8cbf",
  "org.scalablytyped.slinky" %%% "opentype_dot_js" % "0.7-dt-20190212Z-2d1cc4",
  "org.scalablytyped.slinky" %%% "pdfkit" % "v0.10.0-dt-20191119Z-6baf20",
  "org.scalablytyped.slinky" %%% "std" % "3.7-cc3821")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
        