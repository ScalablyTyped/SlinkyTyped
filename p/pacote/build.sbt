organization := "org.scalablytyped.slinky"
name := "pacote"
version := "9.5-dt-20191126Z-4d3fe1"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.2",
  "org.scalablytyped.slinky" %%% "node" % "12.12-dt-20191126Z-6a8cbf",
  "org.scalablytyped.slinky" %%% "node-fetch" % "2.5-dt-20191126Z-047a0d",
  "org.scalablytyped.slinky" %%% "npm-package-arg" % "6.1-dt-20181031Z-0f99f7",
  "org.scalablytyped.slinky" %%% "npm-registry-fetch" % "4.0-dt-20190925Z-f20aea",
  "org.scalablytyped.slinky" %%% "npmlog" % "4.1-dt-20190626Z-805df2",
  "org.scalablytyped.slinky" %%% "ssri" % "6.0-dt-20190422Z-934607",
  "org.scalablytyped.slinky" %%% "std" % "3.7-cc3821")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
        