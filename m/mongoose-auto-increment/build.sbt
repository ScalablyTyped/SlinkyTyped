organization := "org.scalablytyped.slinky"
name := "mongoose-auto-increment"
version := "5.0.1-dt-20191003Z-1a2774"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.2",
  "org.scalablytyped.slinky" %%% "bson" % "4.0-dt-20191119Z-0185dd",
  "org.scalablytyped.slinky" %%% "mongodb" % "3.3-dt-20191118Z-976a48",
  "org.scalablytyped.slinky" %%% "mongoose" % "5.5.1-dt-20191115Z-d452da",
  "org.scalablytyped.slinky" %%% "node" % "12.12-dt-20191126Z-6a8cbf",
  "org.scalablytyped.slinky" %%% "std" % "3.7-cc3821")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
        