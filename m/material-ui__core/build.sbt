organization := "org.scalablytyped.slinky"
name := "material-ui__core"
version := "3.9.3-24beb2"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.2",
  "org.scalablytyped.slinky" %%% "csstype" % "2.6.6-7d274f",
  "org.scalablytyped.slinky" %%% "jss" % "10.0.0-9a9978",
  "org.scalablytyped.slinky" %%% "popper_dot_js" % "1.16.0-bca1a7",
  "org.scalablytyped.slinky" %%% "prop-types" % "15.7-dt-20190924Z-1735fa",
  "org.scalablytyped.slinky" %%% "react" % "16.9-dt-20191025Z-c3107a",
  "org.scalablytyped.slinky" %%% "react-transition-group" % "4.2-dt-20191002Z-eacb23",
  "org.scalablytyped.slinky" %%% "std" % "3.7-5d968d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
        