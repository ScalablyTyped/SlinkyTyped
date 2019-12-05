organization := "org.scalablytyped.slinky"
name := "pouchdb-adapter-websql"
version := "6.1-dt-20190212Z-1ae0c7"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.2",
  "org.scalablytyped.slinky" %%% "debug" % "4.1-dt-20190808Z-4bebb2",
  "org.scalablytyped.slinky" %%% "pouchdb-core" % "7.0-dt-20191111Z-06d8b7",
  "org.scalablytyped.slinky" %%% "pouchdb-find" % "6.3-dt-20190212Z-18f61f",
  "org.scalablytyped.slinky" %%% "std" % "3.7-cc3821")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
        