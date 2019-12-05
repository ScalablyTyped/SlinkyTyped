organization := "org.scalablytyped.slinky"
name := "cwise"
version := "1.0-dt-20180214Z-539938"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.2",
  "org.scalablytyped.slinky" %%% "cwise-compiler" % "1.1-dt-20180214Z-b86f9f",
  "org.scalablytyped.slinky" %%% "cwise-parser" % "1.0-dt-20180301Z-260957",
  "org.scalablytyped.slinky" %%% "ndarray" % "1.0-dt-20190212Z-ba9953",
  "org.scalablytyped.slinky" %%% "std" % "3.7-cc3821")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
        