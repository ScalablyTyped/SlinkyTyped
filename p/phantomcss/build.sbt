organization := "org.scalablytyped.slinky"
name := "phantomcss"
version := "0.11.1-dt-20190322Z-96c893"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.2",
  "org.scalablytyped.slinky" %%% "casperjs" % "1.1-dt-20180214Z-45ba3a",
  "org.scalablytyped.slinky" %%% "phantomjs" % "1.9-dt-20190322Z-90962d",
  "org.scalablytyped.slinky" %%% "resemblejs" % "v1.3.0-dt-20190322Z-83ba2e",
  "org.scalablytyped.slinky" %%% "std" % "3.7-cc3821")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
        