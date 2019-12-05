organization := "org.scalablytyped.slinky"
name := "sanitize-html"
version := "1.20.1-dt-20190916Z-9f3bf1"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.2",
  "org.scalablytyped.slinky" %%% "domhandler" % "2.4-dt-20190326Z-ac5c56",
  "org.scalablytyped.slinky" %%% "domutils" % "1.7-dt-20190326Z-4984a9",
  "org.scalablytyped.slinky" %%% "htmlparser2" % "v3.10.x-dt-20190712Z-8142eb",
  "org.scalablytyped.slinky" %%% "node" % "12.12-dt-20191126Z-6a8cbf",
  "org.scalablytyped.slinky" %%% "std" % "3.7-cc3821")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
        